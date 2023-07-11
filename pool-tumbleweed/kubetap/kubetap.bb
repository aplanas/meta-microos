SUMMARY = "Kubectl plugin to interactively proxy Kubernetes Services with ease"
DESCRIPTION = "Kubetap is a kubectl plugin that enables an operator to easily deploy intercepting proxies for Kubernetes Services."
LICENSE = "Apache-2.0"

PV = "0.1.4"

RPM_NAME = "kubetap-0.1.4-1.11.aarch64.rpm"
RPM_HASH = "f1b85721dca612590893f4168451bdee21a97c0bc1005603153089807caaef415fda12f9013f6a86f22cb6a91c6a1e79ab300dc33e6ea4131b68fbaf863e8af5"

RPROVIDES:${PN} += "kubetap"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
