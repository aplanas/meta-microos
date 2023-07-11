SUMMARY = "SAX2 XML Writer"
DESCRIPTION = "SAX2 XML Writer"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.57"

RPM_NAME = "perl-XML-SAX-Writer-0.57-1.23.noarch.rpm"
RPM_HASH = "ea40cae2a132fdc8dd7a9fb68ecfddff6de9a8ab217c50715fcbfc917fcc2fe557e2705a150ac4d429557af376cbf8e45fb50c447c474b30d5000d907ae41293"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-XML--Filter--BufferText \
perl-XML--NamespaceSupport \
perl-XML--SAX--Exception"

inherit rpm
