SUMMARY = "Easy and Repeatable Kubernetes Development"
DESCRIPTION = "Skaffold is a command line tool that facilitates continuous development for Kubernetes applications. You can iterate on your application source code locally then deploy to local or remote Kubernetes clusters. Skaffold handles the workflow for building, pushing and deploying your application. It also provides building blocks and describe customizations for a CI/CD pipeline."
LICENSE = "Apache-2.0"

PV = "2.6.3"

RPM_NAME = "skaffold-2.6.3-1.1.aarch64.rpm"
RPM_HASH = "3ed6e1983b7bd8101809804a7dc9509b84ff9e72270ee0d501bed138b9c9d4da2173c189e6cc05d59989ecb2619238063d7ede68f341deec72126c31e50aa83e"

RPROVIDES:${PN} += "skaffold"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
