SUMMARY = "Prometheus blackbox prober exporter"
DESCRIPTION = "Prometheus blackbox exporter allows blackbox probing of endpoints over HTTP, HTTPS, DNS, TCP and ICMP."
LICENSE = "Apache-2.0"

PV = "0.19.0"

RPM_NAME = "prometheus-blackbox_exporter-0.19.0-14.1.aarch64.rpm"
RPM_HASH = "32a846779146d7249060df64957a7032225d2576fc551593eaf4b28d15a75e039c7a09f31bb1c1c3987006b5db2191d95110d856d4ee1d59bb54921eb9568295"

RPROVIDES:${PN} += "config(prometheus-blackbox_exporter) \
prometheus-blackbox_exporter \
prometheus-blackbox_exporter(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
group(prometheus) \
libc.so.6()(64bit) \
permissions \
user(prometheus)"

inherit rpm
