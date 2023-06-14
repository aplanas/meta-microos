SUMMARY = "PDF::Core is used by Prawn to render PDF documents"
DESCRIPTION = "PDF::Core is used by Prawn to render PDF documents."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "ruby3.2-rubygem-pdf-core-0.9.0-1.13.aarch64.rpm"
RPM_HASH = "5fcd2fffe59a61fe427334129f954cc7d64b538a578676f7f9af9fd1f44be9c8d86daaf0a669496ec57f2755a8ea7a84a51b465ef8e9892f83b1ed483f1310df"

RPROVIDES:${PN} += "ruby3.2-rubygem-pdf-core \
rubygem-pdf-core \
rubygem-ruby-3.2.0-pdf-core \
rubygem-ruby-3.2.0-pdf-core-0 \
rubygem-ruby-3.2.0-pdf-core-0.9 \
rubygem-ruby-3.2.0-pdf-core-0.9.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
