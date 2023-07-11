SUMMARY = "Multiple dispatch in Python"
DESCRIPTION = "A relatively sane approach to multiple dispatch in Python. \
 \
This implementation of multiple dispatch is mostly complete, \
performs static analysis to avoid conflicts, and provides optional namespace \
support."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python311-multipledispatch-0.6.0-2.11.noarch.rpm"
RPM_HASH = "83a3330ae0e883514daf116d0f5a32f720a987f858d98ad13f1a89c1e4a75e22567874d10f838c719c886f3b68c3fd0e1065fdf02944876b4732804b667a4e90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-multipledispatch \
python3.11dist-multipledispatch \
python311-multipledispatch \
python3dist-multipledispatch"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
