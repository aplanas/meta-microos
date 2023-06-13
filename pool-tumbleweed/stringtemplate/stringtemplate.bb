SUMMARY = "A Java template engine"
DESCRIPTION = "StringTemplate is a java template engine (with ports for \
C# and Python) for generating source code, web pages, \
emails, or any other formatted text output. StringTemplate \
is particularly good at multi-targeted code generators, \
multiple site skins, and internationalization/localization."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "stringtemplate-3.2.1-2.6.noarch.rpm"
RPM_HASH = "f0c463e0149b49e2038c323c133776191ecf6e17752d8808f74d8e414b28e254fd0824f12391661e9ef3cd3d7ecbcc84bbe4b30e77e72e24411b2456e683056c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.antlr:stringtemplate) \
mvn(org.antlr:stringtemplate:pom:) \
stringtemplate"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(antlr:antlr)"

inherit rpm
