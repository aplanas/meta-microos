SUMMARY = "Trivial Java preprocessor"
DESCRIPTION = "Munge is a purposely-simple Java preprocessor. It only supports \
conditional inclusion of source based on defined strings of the \
form 'if[tag]', 'if_not[tag]', 'else[tag]', and 'end[tag]'. \
Unlike traditional preprocessors, comments, and formatting are all \
preserved for the included lines. This is on purpose, as the output \
of Munge will be distributed as human-readable source code. \
 \
To avoid creating a separate Java dialect, the conditional tags are \
contained in Java comments. This allows one build to compile the \
source files without pre-processing, to facilitate faster incremental \
development. Other builds from the same source have their code contained \
within that comment. The format of the tags is a little verbose, so \
that the tags won't accidentally be used by other comment readers \
such as javadoc. Munge tags must be in C-style comments; \
C++-style comments may be used to comment code within a comment. \
 \
Like any preprocessor, developers must be careful not to abuse its \
capabilities so that their code becomes unreadable. Please use it \
as little as possible."
LICENSE = "CDDL-1.0"

PV = "1.0"

RPM_NAME = "munge-maven-plugin-1.0-2.10.noarch.rpm"
RPM_HASH = "041fece5ca24647933a7dafa868abd36b23dfe557822754952c57696d27773b947926001f8aa733f70cdc54d63361f357884d8a4bdac45eeb3f01de5c0596321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "munge-maven-plugin \
mvn(org.sonatype.plugins:munge-maven-plugin) \
mvn(org.sonatype.plugins:munge-maven-plugin:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-plugin-api)"

inherit rpm
