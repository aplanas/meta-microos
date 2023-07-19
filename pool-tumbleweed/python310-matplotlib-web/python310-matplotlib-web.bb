SUMMARY = "Web backend for python310-matplotlib"
DESCRIPTION = "This package includes the browser-based webagg backend \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-web-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "c1a775107fd479806e3909e3a2cde8676287fdce403ae7606866dd6d602d54ee3940f0ea9ac82005a7e19b6aa056c56e03cbca2b0efa77d325207a53937e4597"

RPROVIDES:${PN} += "python310-matplotlib-web"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-tornado"

inherit rpm
