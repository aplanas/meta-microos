SUMMARY = "A Java template engine"
DESCRIPTION = "StringTemplate is a java template engine (with ports for \
C# and Python) for generating source code, web pages, \
emails, or any other formatted text output. StringTemplate \
is particularly good at multi-targeted code generators, \
multiple site skins, and internationalization/localization."
LICENSE = "BSD-3-Clause"

PV = "4.3"

RPM_NAME = "stringtemplate4-4.3-2.11.noarch.rpm"
RPM_HASH = "b97d57da57a6473ec343c0b241fba5b5340735b4c7dc09535378d17a3447557a017ea2f65414d74c2ad7dcc8fea1a17e011725907bf5217ebced16dbea07f140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.antlr-ST4 \
mvn-org.antlr-ST4-pom- \
stringtemplate4"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-antlr-antlr \
mvn-org.antlr-antlr-runtime"

inherit rpm
