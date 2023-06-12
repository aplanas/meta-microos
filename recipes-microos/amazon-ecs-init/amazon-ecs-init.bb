SUMMARY = "Amazon EC2 Container Service Initialization"
DESCRIPTION = "The Amazon EC2 Container Service initialization will start the ECS agent. \
The ECS agent runs in a container and is needed to support integration \
between the aws-cli ecs command line tool and an instance running in \
Amazon EC2."
LICENSE = "Apache-2.0"

PV = "1.53.0"

RPM_NAME = "amazon-ecs-init-1.53.0-1.10.aarch64.rpm"
RPM_HASH = "13e5b5915d0328590eb0733065bcde50b0e7135a7e5ceb8567a8790315d389d6781eaa2b9f4f736bbca679f83b55310329fc2f43c7f313ea89fc4a4cbc5e957d"

RPROVIDES:${PN} += "amazon-ecs-init \
amazon-ecs-init(aarch-64) \
bundled(golang(github.com/Azure/go-ansiterm)) \
bundled(golang(github.com/Azure/go-ansiterm/winterm)) \
bundled(golang(github.com/Microsoft/go-winio)) \
bundled(golang(github.com/NVIDIA/gpu-monitoring-tools/bindings/go/nvml)) \
bundled(golang(github.com/Nvveen/Gotty)) \
bundled(golang(github.com/Sirupsen/logrus)) \
bundled(golang(github.com/aws/aws-sdk-go/aws)) \
bundled(golang(github.com/aws/aws-sdk-go/aws/awserr)) \
bundled(golang(github.com/aws/aws-sdk-go/aws/awsutil)) \
bundled(golang(github.com/aws/aws-sdk-go/aws/client)) \
bundled(golang(github.com/aws/aws-sdk-go/aws/client/metadata)) \
bundled(golang(github.com/aws/aws-sdk-go/aws/corehandlers)) \
bundled(golang(github.com/aws/aws-sdk-go/aws/credentials)) \
bundled(golang(github.com/aws/aws-sdk-go/aws/credentials/ec2rolecreds)) \
bundled(golang(github.com/aws/aws-sdk-go/aws/credentials/endpointcreds)) \
bundled(golang(github.com/aws/aws-sdk-go/aws/credentials/stscreds)) \
bundled(golang(github.com/aws/aws-sdk-go/aws/defaults)) \
bundled(golang(github.com/aws/aws-sdk-go/aws/ec2metadata)) \
bundled(golang(github.com/aws/aws-sdk-go/aws/endpoints)) \
bundled(golang(github.com/aws/aws-sdk-go/aws/request)) \
bundled(golang(github.com/aws/aws-sdk-go/aws/session)) \
bundled(golang(github.com/aws/aws-sdk-go/aws/signer/v4)) \
bundled(golang(github.com/aws/aws-sdk-go/internal/sdkio)) \
bundled(golang(github.com/aws/aws-sdk-go/internal/sdkrand)) \
bundled(golang(github.com/aws/aws-sdk-go/internal/shareddefaults)) \
bundled(golang(github.com/aws/aws-sdk-go/private/protocol)) \
bundled(golang(github.com/aws/aws-sdk-go/private/protocol/query)) \
bundled(golang(github.com/aws/aws-sdk-go/private/protocol/query/queryutil)) \
bundled(golang(github.com/aws/aws-sdk-go/private/protocol/rest)) \
bundled(golang(github.com/aws/aws-sdk-go/private/protocol/restxml)) \
bundled(golang(github.com/aws/aws-sdk-go/private/protocol/xml/xmlutil)) \
bundled(golang(github.com/aws/aws-sdk-go/service/s3)) \
bundled(golang(github.com/aws/aws-sdk-go/service/s3/s3iface)) \
bundled(golang(github.com/aws/aws-sdk-go/service/s3/s3manager)) \
bundled(golang(github.com/aws/aws-sdk-go/service/sts)) \
bundled(golang(github.com/cihub/seelog)) \
bundled(golang(github.com/cihub/seelog/archive)) \
bundled(golang(github.com/cihub/seelog/archive/gzip)) \
bundled(golang(github.com/cihub/seelog/archive/tar)) \
bundled(golang(github.com/cihub/seelog/archive/zip)) \
bundled(golang(github.com/coreos/go-systemd/activation)) \
bundled(golang(github.com/davecgh/go-spew/spew)) \
bundled(golang(github.com/docker/docker/api/types)) \
bundled(golang(github.com/docker/docker/api/types/blkiodev)) \
bundled(golang(github.com/docker/docker/api/types/container)) \
bundled(golang(github.com/docker/docker/api/types/filters)) \
bundled(golang(github.com/docker/docker/api/types/mount)) \
bundled(golang(github.com/docker/docker/api/types/network)) \
bundled(golang(github.com/docker/docker/api/types/registry)) \
bundled(golang(github.com/docker/docker/api/types/strslice)) \
bundled(golang(github.com/docker/docker/api/types/swarm)) \
bundled(golang(github.com/docker/docker/api/types/versions)) \
bundled(golang(github.com/docker/docker/opts)) \
bundled(golang(github.com/docker/docker/pkg/archive)) \
bundled(golang(github.com/docker/docker/pkg/fileutils)) \
bundled(golang(github.com/docker/docker/pkg/homedir)) \
bundled(golang(github.com/docker/docker/pkg/idtools)) \
bundled(golang(github.com/docker/docker/pkg/ioutils)) \
bundled(golang(github.com/docker/docker/pkg/jsonlog)) \
bundled(golang(github.com/docker/docker/pkg/jsonmessage)) \
bundled(golang(github.com/docker/docker/pkg/longpath)) \
bundled(golang(github.com/docker/docker/pkg/mount)) \
bundled(golang(github.com/docker/docker/pkg/pools)) \
bundled(golang(github.com/docker/docker/pkg/promise)) \
bundled(golang(github.com/docker/docker/pkg/stdcopy)) \
bundled(golang(github.com/docker/docker/pkg/system)) \
bundled(golang(github.com/docker/docker/pkg/term)) \
bundled(golang(github.com/docker/docker/pkg/term/windows)) \
bundled(golang(github.com/docker/go-connections/nat)) \
bundled(golang(github.com/docker/go-connections/sockets)) \
bundled(golang(github.com/docker/go-plugins-helpers/sdk)) \
bundled(golang(github.com/docker/go-plugins-helpers/volume)) \
bundled(golang(github.com/docker/go-units)) \
bundled(golang(github.com/fsouza/go-dockerclient)) \
bundled(golang(github.com/go-ini/ini)) \
bundled(golang(github.com/golang/mock/gomock)) \
bundled(golang(github.com/jmespath/go-jmespath)) \
bundled(golang(github.com/opencontainers/go-digest)) \
bundled(golang(github.com/opencontainers/image-spec/specs-go)) \
bundled(golang(github.com/opencontainers/image-spec/specs-go/v1)) \
bundled(golang(github.com/opencontainers/runc/libcontainer/system)) \
bundled(golang(github.com/opencontainers/runc/libcontainer/user)) \
bundled(golang(github.com/pkg/errors)) \
bundled(golang(github.com/pmezard/go-difflib/difflib)) \
bundled(golang(github.com/stretchr/testify/assert)) \
bundled(golang(golang.org/x/net/context)) \
bundled(golang(golang.org/x/net/context/ctxhttp)) \
bundled(golang(golang.org/x/net/proxy)) \
bundled(golang(golang.org/x/sys/unix)) \
bundled(golang(golang.org/x/sys/windows)) \
config(amazon-ecs-init)"
RDEPENDS:${PN} += "/bin/sh \
libc.so.6(GLIBC_2.34)(64bit) \
systemd"

inherit rpm
