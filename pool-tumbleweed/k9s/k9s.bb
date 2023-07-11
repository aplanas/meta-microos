SUMMARY = "Curses based terminal UI for Kubernetes clusters"
DESCRIPTION = "K9s provides a curses based terminal UI to interact with your Kubernetes \
clusters. The aim of this project is to make it easier to navigate, observe \
and manage your applications in the wild. K9s continually watches Kubernetes \
for changes and offers subsequent commands to interact with observed \
Kubernetes resources."
LICENSE = "Apache-2.0"

PV = "0.27.4"

RPM_NAME = "k9s-0.27.4-1.2.aarch64.rpm"
RPM_HASH = "1683de8280e53dab17bd09d2b36eb04b71c94ed18f4376d3d9f56a4f4a989674a34ab65dcbced9f8e5b455713acaa3cc5845a813c6de33d293ff739302a31471"

RPROVIDES:${PN} += "k9s"

RDEPENDS:${PN} += ""

inherit rpm
