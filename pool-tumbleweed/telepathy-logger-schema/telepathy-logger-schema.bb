SUMMARY = "Required schema for the Telepathy Framework Centralized Logging"
DESCRIPTION = "tp-logger is a headless Observer client that logs information received by the \
Telepathy framework. It features pluggable backends to log different sorts of \
messages, in different formats. \
 \
tp-logger features a Telepathy-style D-Bus API to expose logs and interesting \
information related to logging (most frequent contacts, etc.). It also provides \
a GLib-compatible client API for making bulk log requests (e.g. for display \
logs in applications without having to provide lots of information over D-Bus). \
 \
This package provides required GSettings schemas for the tp-logger library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "telepathy-logger-schema-0.8.2-8.1.noarch.rpm"
RPM_HASH = "163c8c676885f8a4e35159ed70bcdbcb4d4eb8647930cdfecd7df78335cece9703cc1f8affb092bae775c4c9d3fae4d60130c367cbc722e6b7d7531bba903afe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "telepathy-logger-schema"

RDEPENDS:${PN} += ""

inherit rpm
