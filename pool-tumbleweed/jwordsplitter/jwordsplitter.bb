SUMMARY = "A Java library to split German compound words"
DESCRIPTION = "This Java library can split German compound words into smaller parts. \
This is especially useful for German words but it can work with all languages, \
as long as a dictionary and a class extending AbstractWordSplitter is provided. \
So far, only German is supported and a German dictionary is included in the JAR. \
Even though it will work for some adjectives it works best for nouns."
LICENSE = "Apache-2.0"

PV = "4.4"

RPM_NAME = "jwordsplitter-4.4-1.19.noarch.rpm"
RPM_HASH = "f89b7680a34b511ee80e15d6903016b265d19b6e15aa51c7ac960f4b4efe89e16a07a6ab49173660371bbf79f4256991e7476b832416fdca36d4d7b7518d40d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jwordsplitter \
mvn-de.danielnaber-jwordsplitter \
mvn-de.danielnaber-jwordsplitter-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
