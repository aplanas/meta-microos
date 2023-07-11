SUMMARY = "Documentation for ntpsec"
DESCRIPTION = "Documentation files generated from asciidoc for ntpsec."
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.2"

RPM_NAME = "ntpsec-doc-1.2.2-1.5.aarch64.rpm"
RPM_HASH = "c230c378941bab94c947c6835506b1e72a3378e1178a734e930cbddaa061834e428104e8a4e06153f9b7ca3a508bae515a18d65162ff9dea7662400a5b25e57b"

RPROVIDES:${PN} += "ntpsec-doc"

RDEPENDS:${PN} += ""

inherit rpm
