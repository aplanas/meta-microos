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

RPM_NAME = "python310-syrupy-4.0.4-1.1.noarch.rpm"
RPM_HASH = "6d296426afa08895a72f2c93c1f2025b60610b05ee6b3c7da86f774e93063ac142b4fa83bd6e99ae60584aa0ad375c50380e4b6b553c29eda84f3d7174fc6053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-syrupy \
python310-syrupy \
python3dist-syrupy"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
