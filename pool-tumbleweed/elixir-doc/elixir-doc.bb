SUMMARY = "Documentation for elixir"
DESCRIPTION = "Documentation for the Elixir language."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "elixir-doc-1.14.2-3.1.noarch.rpm"
RPM_HASH = "003346459c8c1a240fd05c7a96f552dd183a99ccafe16ae596fb78f9f738674620bf9ab5b54e0db41242688d0d2bd87da4a65a19e4ed0a864950ce96ab38edb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elixir-doc"
RDEPENDS:${PN} += "elixir"

inherit rpm
