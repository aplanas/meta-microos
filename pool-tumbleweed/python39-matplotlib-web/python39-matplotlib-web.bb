SUMMARY = "Web backend for python39-matplotlib"
DESCRIPTION = "This package includes the browser-based webagg backend \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-web-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "bce535d926fb7c2fa2d9b8b6c197f9fd0cc82109ec2e3dd470671c8fe6c4af56225ca18792a1557cac3a7b7d622042fb322ecb5606a9c276ef44b0ebe1e12efb"

RPROVIDES:${PN} += "python39-matplotlib-web"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-tornado"

inherit rpm
