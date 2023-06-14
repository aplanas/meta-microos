SUMMARY = "Curses based terminal UI for Kubernetes clusters"
DESCRIPTION = "K9s provides a curses based terminal UI to interact with your Kubernetes \
clusters. The aim of this project is to make it easier to navigate, observe \
and manage your applications in the wild. K9s continually watches Kubernetes \
for changes and offers subsequent commands to interact with observed \
Kubernetes resources."
LICENSE = "Apache-2.0"

PV = "0.27.4"

RPM_NAME = "k9s-0.27.4-1.1.aarch64.rpm"
RPM_HASH = "529dbc19fdb132a9b0ca1cd8893f818f53881c281656a9c205b0868494829578b18ffe9dd972497146859e099d3162c1fc3161c8bc24a2e3734a4640e16ea096"

RPROVIDES:${PN} += "k9s"

RDEPENDS:${PN} += ""

inherit rpm
