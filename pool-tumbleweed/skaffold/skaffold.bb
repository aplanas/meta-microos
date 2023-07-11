SUMMARY = "Easy and Repeatable Kubernetes Development"
DESCRIPTION = "Skaffold is a command line tool that facilitates continuous development for Kubernetes applications. You can iterate on your application source code locally then deploy to local or remote Kubernetes clusters. Skaffold handles the workflow for building, pushing and deploying your application. It also provides building blocks and describe customizations for a CI/CD pipeline."
LICENSE = "Apache-2.0"

PV = "2.6.1"

RPM_NAME = "skaffold-2.6.1-1.1.aarch64.rpm"
RPM_HASH = "65b037f87c07a665dbbeaee933a9ad76b0a9aab0d1343c78661b34d48795c6ef178442a46690c0c546b431f59421729c5b241bdd46f99dada50b8d22689387d7"

RPROVIDES:${PN} += "skaffold"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
