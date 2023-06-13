SUMMARY = "Source code of prometheus-client-model"
DESCRIPTION = "prometheus-client-model provides data model artifacts for Prometheus in form of \
protobufs and libraries. \
 \
This package contains source code for prometheus-client-model."
LICENSE = "Apache-2.0"

PV = "20190109"

RPM_NAME = "prometheus-client-model-source-20190109-3.9.noarch.rpm"
RPM_HASH = "2fb93e1e0b669132ad63bb9d6fef38939eb252fa19cb28c0dc82f4b51f7a8f7c7f31d6abfab207bfdebad2ce23a7aaca90d5b68561f7d39b32d65e55186f93db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "prometheus-client-model-source"

RDEPENDS:${PN} += ""

inherit rpm
