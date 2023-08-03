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

RPM_NAME = "python39-syrupy-4.0.8-1.1.noarch.rpm"
RPM_HASH = "6cc563fd564dcc8ae883566cb56d0791530cef97575dd79381577f82b5d221d30ff5be731a1681dfdb7188920e00276c36225a2338f7d573a62c2372b4b29969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-syrupy \
python39-syrupy \
python3dist-syrupy"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
