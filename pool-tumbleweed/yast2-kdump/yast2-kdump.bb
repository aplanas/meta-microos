SUMMARY = "Configuration of kdump"
DESCRIPTION = "Configuration of kdump"
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-kdump-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "2de2e7f2ec8448fa0b71ca52b55df08a6bf9ed7a0fd2739f2b87262e83d920ecb1d32406e2169761c93b992c52c562f0061be00b9d7f86607ef444fa168c8958"

RPROVIDES:${PN} += "yast2-kdump"

RDEPENDS:${PN} += "yast2 \
yast2-bootloader \
yast2-packager \
yast2-ruby-bindings"

inherit rpm
