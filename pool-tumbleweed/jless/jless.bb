SUMMARY = "Pager for JSON (or YAML) data"
DESCRIPTION = "JLess is a command-line JSON viewer designed for reading, exploring, and \
searching through JSON data. \
 \
JLess will pretty print your JSON and apply syntax highlighting. Use it when \
exploring external APIs, or debugging request payloads. \
 \
Expand and collapse Objects and Arrays to grasp the high- and low-level \
structure of a JSON document. JLess has a large suite of vim-inspired commands \
that make exploring data a breeze. \
 \
JLess supports full text regular-expression based search. Quickly find the data \
you're looking for in long String values, or jump between values for the same \
Object key."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "jless-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "081d15e874c02d0b76b66e6c37285527de0091c00c6799194224598f2a08d7140e39ab0154e165ed88b10d785ffd98a9c4ec16363770aa05840c7777ae2c6708"

RPROVIDES:${PN} += "jless"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libxcb-render.so.0 \
libxcb-shape.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
