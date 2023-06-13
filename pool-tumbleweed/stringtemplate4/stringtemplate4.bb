SUMMARY = "A Java template engine"
DESCRIPTION = "StringTemplate is a java template engine (with ports for \
C# and Python) for generating source code, web pages, \
emails, or any other formatted text output. StringTemplate \
is particularly good at multi-targeted code generators, \
multiple site skins, and internationalization/localization."
LICENSE = "BSD-3-Clause"

PV = "4.3"

RPM_NAME = "stringtemplate4-4.3-2.10.noarch.rpm"
RPM_HASH = "2701e44021a244b0b1d6923ff7039a23666e443aede4a95ff77b3f6a646cf390437cf764881e70d5c240d0d44883ddd0307ce8f8f112831c28bd7ae6e19e76d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.antlr:ST4) \
mvn(org.antlr:ST4:pom:) \
stringtemplate4"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(antlr:antlr) \
mvn(org.antlr:antlr-runtime)"

inherit rpm
