SUMMARY = "Cairo backend for python310-matplotlib"
DESCRIPTION = "This package includes the non-interactive Cairo-based backend \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-cairo-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "fea39b5af4c41ea8beff2e09c14964c38702f5407d46b32c6f09f74d9c3b5900fbf854b7b7ae7d3f0678dfd69ae370bef311cfeadb861c28c3a2b06806ebab7b"

RPROVIDES:${PN} += "python3-matplotlib-cairo \
python310-matplotlib-cairo \
python310-matplotlib-cairo(aarch-64)"

RDEPENDS:${PN} += "python(abi) \
python310-cairo \
python310-matplotlib"

inherit rpm
