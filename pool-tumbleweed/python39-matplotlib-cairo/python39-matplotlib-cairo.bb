SUMMARY = "Cairo backend for python39-matplotlib"
DESCRIPTION = "This package includes the non-interactive Cairo-based backend \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-cairo-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "dfa7769787185ebdce4ca21b65074c5a0be0d6895a948e769bc138bed765d2141b061228bb5a3419ba4459005b41d1632a0950e5f9566e6f7f880eff4de4eb23"

RPROVIDES:${PN} += "python39-matplotlib-cairo"

RDEPENDS:${PN} += "python-abi \
python39-cairo \
python39-matplotlib"

inherit rpm
