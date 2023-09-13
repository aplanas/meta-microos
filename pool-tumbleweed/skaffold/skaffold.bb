SUMMARY = "Easy and Repeatable Kubernetes Development"
DESCRIPTION = "Skaffold is a command line tool that facilitates continuous development for Kubernetes applications. You can iterate on your application source code locally then deploy to local or remote Kubernetes clusters. Skaffold handles the workflow for building, pushing and deploying your application. It also provides building blocks and describe customizations for a CI/CD pipeline."
LICENSE = "Apache-2.0"

PV = "2.7.0"

RPM_NAME = "skaffold-2.7.0-1.1.aarch64.rpm"
RPM_HASH = "c3ee410986df13c65398d8e325aebe87fc21639588511d3d959b2e9e4cd6517913d032c7b98e03f8aa320fe97ec7d227a81ac20424ae49535714eab4f29c01bb"

RPROVIDES:${PN} += "skaffold"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
