SUMMARY = "ExDoc produces HTML and online documentation for Elixir projects"
DESCRIPTION = "ExDoc is a tool to generate documentation for your Elixir projects. In case you are looking for documentation for Elixir itself, check out Elixir's website."
LICENSE = "Apache-2.0 & MIT"

PV = "0.7.2"

RPM_NAME = "elixir-ex_doc-0.7.2-1.15.aarch64.rpm"
RPM_HASH = "c19ae236c1c3ba85ef58bcd6c1ceee9df258fe18ebfce09b390bec140c9b74039deb9c0ae4a2158d7e3a0c41145eaff5c58ad178d4cfabce73e0928a4925710e"

RPROVIDES:${PN} += "elixir-ex-doc"

RDEPENDS:${PN} += "/usr/bin/env \
elixir"

inherit rpm
