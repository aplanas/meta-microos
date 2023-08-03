SUMMARY = "Package manager for Kubernetes, powered by CUE and inspired by Helm"
DESCRIPTION = "Timoni is a package manager for Kubernetes, powered by CUE and inspired by Helm. \
 \
The Timoni project strives to improve the UX of authoring Kubernetes configs. Instead of mingling Go templates with YAML like Helm, or layering YAML on top of each-other like Kustomize, Timoni relies on cuelang's type safety, code generation and data validation features to offer a better experience of creating, packaging and delivering apps to Kubernetes."
LICENSE = "Apache-2.0"

PV = "0.11.1"

RPM_NAME = "timoni-0.11.1-1.1.aarch64.rpm"
RPM_HASH = "2074253b7c77bc69a4180c916b3fb2809fb07ce0acfb6744d9155b727d86155396fedf9c28bba0b192962c9923e3908e97eb589d44401ad29bb7749a61bbb12d"

RPROVIDES:${PN} += "timoni"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
