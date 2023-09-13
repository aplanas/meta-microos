SUMMARY = "Package manager for Kubernetes, powered by CUE and inspired by Helm"
DESCRIPTION = "Timoni is a package manager for Kubernetes, powered by CUE and inspired by Helm. \
 \
The Timoni project strives to improve the UX of authoring Kubernetes configs. Instead of mingling Go templates with YAML like Helm, or layering YAML on top of each-other like Kustomize, Timoni relies on cuelang's type safety, code generation and data validation features to offer a better experience of creating, packaging and delivering apps to Kubernetes."
LICENSE = "Apache-2.0"

PV = "0.12.1"

RPM_NAME = "timoni-0.12.1-1.1.aarch64.rpm"
RPM_HASH = "fc10c92d6a2125b4f7765e586be5750d1a6ffcd02047267324cb67f6586566b607207310d827ccee64aadacfaebf636a73275911d338add77c3bb0fde21c7e31"

RPROVIDES:${PN} += "timoni"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
