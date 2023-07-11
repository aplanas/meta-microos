SUMMARY = "AWS SDK for Java"
DESCRIPTION = "The AWS SDK for Java enables Java developers to easily work with \
Amazon Web Services and build scalable solutions with Amazon S3, \
Amazon DynamoDB, Amazon Glacier, and more."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-1.11.3-7.9.noarch.rpm"
RPM_HASH = "f0c5d8d934333c84cacd889ee10c15502caa3b12559d884926c5acd8c93cf47147c1e3a724659edf7dde2014539067b5c67ab7421b4169beb3ac72b451a95c9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java \
mvn-com.amazonaws-aws-java-sdk \
mvn-com.amazonaws-aws-java-sdk-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-acm \
mvn-com.amazonaws-aws-java-sdk-api-gateway \
mvn-com.amazonaws-aws-java-sdk-applicationautoscaling \
mvn-com.amazonaws-aws-java-sdk-autoscaling \
mvn-com.amazonaws-aws-java-sdk-cloudformation \
mvn-com.amazonaws-aws-java-sdk-cloudfront \
mvn-com.amazonaws-aws-java-sdk-cloudhsm \
mvn-com.amazonaws-aws-java-sdk-cloudsearch \
mvn-com.amazonaws-aws-java-sdk-cloudtrail \
mvn-com.amazonaws-aws-java-sdk-cloudwatch \
mvn-com.amazonaws-aws-java-sdk-cloudwatchmetrics \
mvn-com.amazonaws-aws-java-sdk-codecommit \
mvn-com.amazonaws-aws-java-sdk-codedeploy \
mvn-com.amazonaws-aws-java-sdk-codepipeline \
mvn-com.amazonaws-aws-java-sdk-cognitoidentity \
mvn-com.amazonaws-aws-java-sdk-cognitoidp \
mvn-com.amazonaws-aws-java-sdk-cognitosync \
mvn-com.amazonaws-aws-java-sdk-config \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-com.amazonaws-aws-java-sdk-datapipeline \
mvn-com.amazonaws-aws-java-sdk-devicefarm \
mvn-com.amazonaws-aws-java-sdk-directconnect \
mvn-com.amazonaws-aws-java-sdk-directory \
mvn-com.amazonaws-aws-java-sdk-discovery \
mvn-com.amazonaws-aws-java-sdk-dms \
mvn-com.amazonaws-aws-java-sdk-dynamodb \
mvn-com.amazonaws-aws-java-sdk-ec2 \
mvn-com.amazonaws-aws-java-sdk-ecr \
mvn-com.amazonaws-aws-java-sdk-ecs \
mvn-com.amazonaws-aws-java-sdk-efs \
mvn-com.amazonaws-aws-java-sdk-elasticache \
mvn-com.amazonaws-aws-java-sdk-elasticbeanstalk \
mvn-com.amazonaws-aws-java-sdk-elasticloadbalancing \
mvn-com.amazonaws-aws-java-sdk-elasticsearch \
mvn-com.amazonaws-aws-java-sdk-elastictranscoder \
mvn-com.amazonaws-aws-java-sdk-emr \
mvn-com.amazonaws-aws-java-sdk-events \
mvn-com.amazonaws-aws-java-sdk-gamelift \
mvn-com.amazonaws-aws-java-sdk-glacier \
mvn-com.amazonaws-aws-java-sdk-iam \
mvn-com.amazonaws-aws-java-sdk-importexport \
mvn-com.amazonaws-aws-java-sdk-inspector \
mvn-com.amazonaws-aws-java-sdk-iot \
mvn-com.amazonaws-aws-java-sdk-kinesis \
mvn-com.amazonaws-aws-java-sdk-kms \
mvn-com.amazonaws-aws-java-sdk-lambda \
mvn-com.amazonaws-aws-java-sdk-logs \
mvn-com.amazonaws-aws-java-sdk-machinelearning \
mvn-com.amazonaws-aws-java-sdk-marketplacecommerceanalytics \
mvn-com.amazonaws-aws-java-sdk-marketplacemeteringservice \
mvn-com.amazonaws-aws-java-sdk-opsworks \
mvn-com.amazonaws-aws-java-sdk-rds \
mvn-com.amazonaws-aws-java-sdk-redshift \
mvn-com.amazonaws-aws-java-sdk-route53 \
mvn-com.amazonaws-aws-java-sdk-s3 \
mvn-com.amazonaws-aws-java-sdk-ses \
mvn-com.amazonaws-aws-java-sdk-simpledb \
mvn-com.amazonaws-aws-java-sdk-simpleworkflow \
mvn-com.amazonaws-aws-java-sdk-sns \
mvn-com.amazonaws-aws-java-sdk-sqs \
mvn-com.amazonaws-aws-java-sdk-ssm \
mvn-com.amazonaws-aws-java-sdk-storagegateway \
mvn-com.amazonaws-aws-java-sdk-sts \
mvn-com.amazonaws-aws-java-sdk-support \
mvn-com.amazonaws-aws-java-sdk-waf \
mvn-com.amazonaws-aws-java-sdk-workspaces"

inherit rpm
