SUMMARY = "Pytest Snapshot Test Utility"
DESCRIPTION = "Syrupy is a [pytest](https://docs.pytest.org/en/latest/) snapshot plugin. It enables developers to write tests which assert immutability of computed results. \
 \
The most popular snapshot test plugin compatible with pytest has some core limitations which this package attempts to address by upholding some key values: \
 \
- Extensible: If a particular data type is not supported, users should be able to easily and quickly add support. \
- Idiomatic: Snapshot testing should fit naturally among other test cases in pytest, e.g. `assert x == snapshot` vs. `snapshot.assert_match(x)`. \
- Soundness: Snapshot tests should uncover even the most minute issues. Unlike other snapshot libraries, Syrupy will fail a test suite if a snapshot does not exist, not just on snapshot differences."
LICENSE = "Apache-2.0"

PV = "4.0.4"

RPM_NAME = "python39-syrupy-4.0.4-1.1.noarch.rpm"
RPM_HASH = "b8ce2ecf0b06012f8ecf4ab29906ba009d6d6b272b80976ff7b33456db0c53f0373866d0d4449e7da42c43d5c3193b3e0ed7464e059b84203d1f4bfdf7b1219b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-syrupy \
python39-syrupy \
python3dist-syrupy"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
