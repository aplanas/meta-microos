SUMMARY = "Docker build wrapper"
DESCRIPTION = "Dapper is a tool to wrap any existing build tool in an consistent environment. This allows people to build your software from source or modify it without worrying about setting up a build environment. The approach is very simple and taken from a common pattern that has adopted by many open source projects. Create a file called Dockerfile.dapper in the root of your repository. Dapper will build that Dockerfile and then execute a container based off of the resulting image. Dapper will also copy in source files and copy out resulting artifacts or will use bind mounting if you choose."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "dapper-0.6.0-1.7.aarch64.rpm"
RPM_HASH = "cdc51798ffd577573c1ffd4bd79ebb0fa4b8a76939b01b3fc0d51dbc04f801ff1f8e1760b278cd44f001452377c63433ce2bc84689b5a4e288c205bbbce3106f"

RPROVIDES:${PN} += "dapper"

RDEPENDS:${PN} += ""

inherit rpm
