SUMMARY = "Web backend for python310-matplotlib"
DESCRIPTION = "This package includes the browser-based webagg backend \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-web-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "459bf07abd147ca84b50e2f1b8042fae99f1f3f0f678a9b948d05d9c799c268f845c0abef0d3b415fd14de3b047ec09c78dd8d734fabfd074efc6645c20ad88a"

RPROVIDES:${PN} += "python310-matplotlib-web"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-tornado"

inherit rpm
