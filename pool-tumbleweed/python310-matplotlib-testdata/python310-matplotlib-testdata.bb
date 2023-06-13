SUMMARY = "Test data for python310-matplotlib"
DESCRIPTION = "This package includes the test baseline data \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-testdata-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "d85b64acbb056563209b81106f690d67dc7e3c303884a68c964bf1f6361ddc72a4a2a9962b2975300035d5284a05ae7097225ee9a9c62fada0ca11da56c1f3b4"

RPROVIDES:${PN} += "python3-matplotlib-testdata \
python310-matplotlib-testdata \
python310-matplotlib-testdata(aarch-64)"

RDEPENDS:${PN} += "python(abi) \
python310-matplotlib"

inherit rpm
