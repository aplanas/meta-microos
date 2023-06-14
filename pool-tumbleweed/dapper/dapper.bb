SUMMARY = "Docker build wrapper"
DESCRIPTION = "Dapper is a tool to wrap any existing build tool in an consistent environment. This allows people to build your software from source or modify it without worrying about setting up a build environment. The approach is very simple and taken from a common pattern that has adopted by many open source projects. Create a file called Dockerfile.dapper in the root of your repository. Dapper will build that Dockerfile and then execute a container based off of the resulting image. Dapper will also copy in source files and copy out resulting artifacts or will use bind mounting if you choose."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "dapper-0.6.0-1.6.aarch64.rpm"
RPM_HASH = "eec631537bc5b186c27f196694cb729094fb27b1197d8b80616e5e8c11db3a585f9086b73ac63b517269fae73d56487921d92091ab44ad73604350a875b360aa"

RPROVIDES:${PN} += "dapper"

RDEPENDS:${PN} += ""

inherit rpm
