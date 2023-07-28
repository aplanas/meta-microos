SUMMARY = "Easy and Repeatable Kubernetes Development"
DESCRIPTION = "Skaffold is a command line tool that facilitates continuous development for Kubernetes applications. You can iterate on your application source code locally then deploy to local or remote Kubernetes clusters. Skaffold handles the workflow for building, pushing and deploying your application. It also provides building blocks and describe customizations for a CI/CD pipeline."
LICENSE = "Apache-2.0"

PV = "2.6.2"

RPM_NAME = "skaffold-2.6.2-1.1.aarch64.rpm"
RPM_HASH = "0a73bc2590bd9611df10d5cb3561e795744fe4ea3793ea296cd785447f816902679c1d30ce7b084732a221f479234127b2e178f04dba9f3116514ec4b9770022"

RPROVIDES:${PN} += "skaffold"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
