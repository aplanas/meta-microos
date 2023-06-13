SUMMARY = "A generic swappable back-end for XML parsing"
DESCRIPTION = "Provides swappable XML backends utilizing LibXML, Nokogiri, Ox, or REXML."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "ruby3.2-rubygem-multi_xml-0.6.0-1.20.aarch64.rpm"
RPM_HASH = "5111441653cc402fa72a7449d91eee6b7a4663c26ccd13515b6b53f25ccf000a2ffafffe0031aff0113f9e2f90c0c9e7ad48e27276e4425949a4d0cdc460af5e"

RPROVIDES:${PN} += "ruby3.2-rubygem-multi_xml \
ruby3.2-rubygem-multi_xml(aarch-64) \
rubygem(multi_xml) \
rubygem(ruby:3.2.0:multi_xml) \
rubygem(ruby:3.2.0:multi_xml:0) \
rubygem(ruby:3.2.0:multi_xml:0.6) \
rubygem(ruby:3.2.0:multi_xml:0.6.0)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
