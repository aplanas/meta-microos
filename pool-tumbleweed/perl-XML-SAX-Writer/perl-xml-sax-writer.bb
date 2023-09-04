SUMMARY = "SAX2 XML Writer"
DESCRIPTION = "SAX2 XML Writer"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.57"

RPM_NAME = "perl-XML-SAX-Writer-0.57-1.24.noarch.rpm"
RPM_HASH = "fe2f50367a3fe3f2a75751682734bcd90c198b5b739561f311f386eaa492d16e312b64c39091b6e6d63906d0ac7a491a1d9913d0c0ebfd27bd25060f8bef9e94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--SAX--Writer \
perl-XML--SAX--Writer--ArrayConsumer \
perl-XML--SAX--Writer--CodeConsumer \
perl-XML--SAX--Writer--ConsumerInterface \
perl-XML--SAX--Writer--Encode \
perl-XML--SAX--Writer--FileConsumer \
perl-XML--SAX--Writer--HandleConsumer \
perl-XML--SAX--Writer--NullConverter \
perl-XML--SAX--Writer--StringConsumer \
perl-XML--SAX--Writer--XML \
perl-XML-SAX-Writer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-XML--Filter--BufferText \
perl-XML--NamespaceSupport \
perl-XML--SAX--Exception"

inherit rpm
