SUMMARY = "Google Cloud Platform gRPC extensions"
DESCRIPTION = "gRPC extensions for Google Cloud Platform."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python311-grpcio-gcp-0.2.2-1.16.noarch.rpm"
RPM_HASH = "b5a1ee8466d3f7444e503bda1fbe4e9bdba3482822013437a1fc4f65a79dc9db800155f6aa364c70bfa088f5c92d2b885bf204ebe3090ab87ca5075b4fe0dd4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(grpcio-gcp) \
python311-grpcio-gcp \
python3dist(grpcio-gcp)"

RDEPENDS:${PN} += "python(abi) \
python311-grpcio"

inherit rpm
