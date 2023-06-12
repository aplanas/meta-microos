SUMMARY = "Show Python regex match assertion failures"
DESCRIPTION = "Show where your regex match assertion failed."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-re-assert-1.1.0-2.1.noarch.rpm"
RPM_HASH = "a09eb634757d4b3ca79447f37533aff6178c5c2f3bbd3b4836e85d6e96e215e0f39ba4ba5f952fe6e9bfd0d5c6078cf6903e117cfd1620f1c7f5759e6416b6ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(re-assert) \
python311-re-assert \
python3dist(re-assert)"
RDEPENDS:${PN} += "python(abi) \
python311-regex"

inherit rpm
