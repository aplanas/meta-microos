SUMMARY = "Ritchie - One CLI to rule them all"
DESCRIPTION = "Ritchie is an open source framework that creates and tweaks a CLI for your team. It allows you to easily create, build and share formulas. This package contains the CLI core, which can execute formulas stored inside other repositories such as ritchie-formulas."
LICENSE = "Apache-2.0"

PV = "2.11.3"

RPM_NAME = "ritchie-cli-2.11.3-2.11.aarch64.rpm"
RPM_HASH = "c054fe6c4b3ba3494833f5ad1b6d16e7436fa817b91390492d4906091eb0d86b65863af607bb9f70a111c955426cbb904b684ddc61bb74ba9870ea551e8e0351"

RPROVIDES:${PN} += "ritchie-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
