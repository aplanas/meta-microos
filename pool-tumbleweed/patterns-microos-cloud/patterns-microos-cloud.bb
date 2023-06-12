SUMMARY = "Support for Cloud"
DESCRIPTION = "Packages required to enable openSUSE MicroOS in the Cloud."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-cloud-5.0-70.1.aarch64.rpm"
RPM_HASH = "c528afb8f6d13a62c49f906b08da373f87658094b4ae34d91283d29c43d04bc75e1021543e422af4c5502304f74f01cb5d15add0c7c66cf84c7b351aa78eabc9"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-microos-cloud \
patterns-microos-cloud(aarch-64)"
RDEPENDS:${PN} += "cloud-init \
cloud-init-config-MicroOS"

inherit rpm
