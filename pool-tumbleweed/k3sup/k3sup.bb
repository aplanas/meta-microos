SUMMARY = "Bootstrap Kubernetes with k3s over SSH < 1 min"
DESCRIPTION = "k3sup is a light-weight utility to get from zero to KUBECONFIG with k3s on any local or remote VM. All you need is ssh access and the k3sup binary to get kubectl access immediately. \
The tool is written in Go and is cross-compiled for Linux, Windows, MacOS and even on Raspberry Pi. \
How do you say it? Ketchup, as in tomato."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "k3sup-0.13.0-1.1.aarch64.rpm"
RPM_HASH = "0d5169429ce44871cfa5f8577f4a61c170375d9b126e3b7d41d487e03207fca4c23aea9739d72cf0ce7add6c00b2f18a88239fcaa8b53b244bb8b961bfa08cff"

RPROVIDES:${PN} += "k3sup"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
