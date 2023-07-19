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

RPM_NAME = "python311-syrupy-4.0.4-1.1.noarch.rpm"
RPM_HASH = "4f36e610119c3e2ef797bb35327aadfed1b9cd6b00b6b17a9874c90a33aeb038eec1aed80c86c338a3922a1913dd756475e40caa8632621ca50ba0de981d6192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-syrupy \
python3.11dist-syrupy \
python311-syrupy \
python3dist-syrupy"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
