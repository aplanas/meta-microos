SUMMARY = "DSSSL Stylesheets for the DocBook DTD"
DESCRIPTION = "Use these DSSSL stylesheets to convert DocBook documents into other \
formats. 'Print' (TeX and RTF) and 'online' (HTML) output formats are \
available. \
 \
The stylesheets are customizable and, within limits, it is possible to \
adapt them for your own needs. Numerous native languages are supported. \
 \
The authors of these stylesheets do not inlude any new features, but \
only fix bugs."
LICENSE = "SUSE-XSL-Lint"

PV = "1.79"

RPM_NAME = "docbook-dsssl-stylesheets-1.79-176.10.noarch.rpm"
RPM_HASH = "cd963c724752a44e7c94a121ddd44e01782559f7049cfcd213f110840cfd2e4a6e935b0561ef83e9806d774492008f0cbf8238d23c02cc384978b2467c82beed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbkdsl \
docbook-dsssl-stylesheets"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/sgml-register-catalog \
docbook_3 \
docbook_4"

inherit rpm
