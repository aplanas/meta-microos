SUMMARY = "Tryton module for purchase requests"
DESCRIPTION = "The purchase_request module of the Tryton application platform allows you to create a purchase request as pre-step for a purchase"
LICENSE = "GPL-3.0-only"

PV = "6.0.4"

RPM_NAME = "trytond_purchase_request-6.0.4-1.2.noarch.rpm"
RPM_HASH = "1b530db5c2d136c90d9aac9c59e8c0e81a1fb5f0c8400abbf3585aa03a2a05929cf688d2f824ceebfa9a6fe8cf2f5cc5557f15e84291dd273d4d5a84eda5e1b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-trytond-purchase-request \
python3dist-trytond-purchase-request \
trytond-purchase-request"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-product \
trytond-purchase"

inherit rpm
