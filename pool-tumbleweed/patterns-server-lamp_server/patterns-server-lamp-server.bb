SUMMARY = "Web and LAMP Server"
DESCRIPTION = "Software to set up a Web server that is able to serve static, dynamic, and interactive content (like a Web shop). This includes Apache HTTP Server, the database management system MySQL, and scripting languages such as PHP, Python, Ruby on Rails, or Perl."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-lamp_server-20210330-5.1.aarch64.rpm"
RPM_HASH = "67dd81b9c1b186d27799c7674810d62cbeb9893fb7b5a25bd58d11c9ace87b398fb508eba8edcc5bba4423c0852164b240f579c98c05c1326db64dd7e78d628b"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-openSUSE-lamp-server \
patterns-server-lamp-server"

RDEPENDS:${PN} += "apache2 \
pattern-"

inherit rpm
