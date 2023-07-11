SUMMARY = "Bootstrap Kubernetes with k3s over SSH < 1 min"
DESCRIPTION = "k3sup is a light-weight utility to get from zero to KUBECONFIG with k3s on any local or remote VM. All you need is ssh access and the k3sup binary to get kubectl access immediately. \
The tool is written in Go and is cross-compiled for Linux, Windows, MacOS and even on Raspberry Pi. \
How do you say it? Ketchup, as in tomato."
LICENSE = "MIT"

PV = "0.12.12"

RPM_NAME = "k3sup-0.12.12-1.2.aarch64.rpm"
RPM_HASH = "c8b792828786d03937c10b45af0acd8db56a6006fcd08a5ae42e8816525bc31213c8efc730f5baee55226af85d0d84d6b9d70bd2df7eb454ebd8ef79e07085a4"

RPROVIDES:${PN} += "k3sup"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
