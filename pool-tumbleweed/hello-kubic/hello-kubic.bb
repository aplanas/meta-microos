SUMMARY = "A mini webserver showing a hello kubic page"
DESCRIPTION = "hello-kubic is a mini webserver with a 'Hello Kubic' webpage \
containing some informations about the running system, container \
or pod."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "hello-kubic-1.4.1-1.7.aarch64.rpm"
RPM_HASH = "c52de8859fe95adfb630704c7ce86519a55aa5e9946c7225146466b17893d5ad3edb28229bb4177bdd933c69aac9166db859f054178f2de785496060ad6029f9"

RPROVIDES:${PN} += "hello-kubic"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
