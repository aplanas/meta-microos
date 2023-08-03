SUMMARY = "Pytest Snapshot Test Utility"
DESCRIPTION = "Syrupy is a [pytest](https://docs.pytest.org/en/latest/) snapshot plugin. It enables developers to write tests which assert immutability of computed results. \
 \
The most popular snapshot test plugin compatible with pytest has some core limitations which this package attempts to address by upholding some key values: \
 \
- Extensible: If a particular data type is not supported, users should be able to easily and quickly add support. \
- Idiomatic: Snapshot testing should fit naturally among other test cases in pytest, e.g. `assert x == snapshot` vs. `snapshot.assert_match(x)`. \
- Soundness: Snapshot tests should uncover even the most minute issues. Unlike other snapshot libraries, Syrupy will fail a test suite if a snapshot does not exist, not just on snapshot differences."
LICENSE = "Apache-2.0"

PV = "4.0.8"

RPM_NAME = "python310-syrupy-4.0.8-1.1.noarch.rpm"
RPM_HASH = "73da96a8f9ce8d2277a7a3a4c0be3b08bdd29fc21be3613868eecaa5c5696a653950bae88f642e04159f09776f6415268d15bcaf20535fe2f8002aeb874dd52a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-syrupy \
python310-syrupy \
python3dist-syrupy"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
