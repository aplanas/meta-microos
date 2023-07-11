SUMMARY = "A Java template engine"
DESCRIPTION = "StringTemplate is a java template engine (with ports for \
C# and Python) for generating source code, web pages, \
emails, or any other formatted text output. StringTemplate \
is particularly good at multi-targeted code generators, \
multiple site skins, and internationalization/localization."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "stringtemplate-3.2.1-2.7.noarch.rpm"
RPM_HASH = "1173b47b7dd4938ebf0354f7639921b89e0dc85ec80220525036049f9131ca08b0f79cbd93f70c5f579f044d9004034d44ba419928fb35a74807cb3db4ffd8f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.antlr-stringtemplate \
mvn-org.antlr-stringtemplate-pom- \
stringtemplate"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-antlr-antlr"

inherit rpm
