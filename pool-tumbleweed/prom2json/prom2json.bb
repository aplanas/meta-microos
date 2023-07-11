SUMMARY = "CLI tool to scrape a Prometheus client and dump the result as JSON"
DESCRIPTION = "The prom2json CLI tool scrapes a Prometheus client \
in protocol buffer or text format \
and dumps the result as JSON to stdout"
LICENSE = "Apache-2.0"

PV = "1.3.2"

RPM_NAME = "prom2json-1.3.2-1.4.aarch64.rpm"
RPM_HASH = "87b5b8a11dcaededdfeab6b1f0b23a4f45c2b23cb73912215693de149fd421b47f776a37ad575b3b51ef6090360d6673a380ec474d78c8c2fafa9b201f6ec4f3"

RPROVIDES:${PN} += "prom2json"

RDEPENDS:${PN} += ""

inherit rpm
