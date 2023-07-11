SUMMARY = "ExDoc produces HTML and online documentation for Elixir projects"
DESCRIPTION = "ExDoc is a tool to generate documentation for your Elixir projects. In case you are looking for documentation for Elixir itself, check out Elixir's website."
LICENSE = "Apache-2.0 & MIT"

PV = "0.7.2"

RPM_NAME = "elixir-ex_doc-0.7.2-1.16.aarch64.rpm"
RPM_HASH = "2900c47c7a0c91d3738e9a0e02be297f726469e40f7553b686a9a82ee0f57998baa8b015f4dcc0f0e5dffbda7c2713c5d0877368e5c9414e4c508ec09a67d0b3"

RPROVIDES:${PN} += "elixir-ex-doc"

RDEPENDS:${PN} += "/usr/bin/env \
elixir"

inherit rpm
