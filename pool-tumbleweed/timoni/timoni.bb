SUMMARY = "Package manager for Kubernetes, powered by CUE and inspired by Helm"
DESCRIPTION = "Timoni is a package manager for Kubernetes, powered by CUE and inspired by Helm. \
 \
The Timoni project strives to improve the UX of authoring Kubernetes configs. Instead of mingling Go templates with YAML like Helm, or layering YAML on top of each-other like Kustomize, Timoni relies on cuelang's type safety, code generation and data validation features to offer a better experience of creating, packaging and delivering apps to Kubernetes."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "timoni-0.10.0-1.1.aarch64.rpm"
RPM_HASH = "e69fa3f7905b8c5bdbcd1907c2c6d3ee4ff4e5a34db18bfce1d370d686cebcc3904893f064aa07d0037f487d8c3419bb58a0a358072863c2283321e3c41baee0"

RPROVIDES:${PN} += "timoni"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
